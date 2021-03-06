package fr.lidadi.jee.eventmanager.app.event;

import static fr.lidadi.jee.eventmanager.framework.dao.sqldsl.SQLRequestFactory.equal;
import static fr.lidadi.jee.eventmanager.framework.dao.sqldsl.SQLRequestFactory.isNotNull;
import static fr.lidadi.jee.eventmanager.framework.dao.sqldsl.SQLRequestFactory.where;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import fr.lidadi.jee.eventmanager.app.person.Person;
import fr.lidadi.jee.eventmanager.framework.dao.Dao;

/**
 * Created by damien on 18/10/2016.
 */
public class EventDao extends Dao<Event, UUID> {

	public List<Event> getAllPublished() {
		return this.findBy(where(isNotNull("publishingDate")));
	}

	public List<Event> getByOwner(UUID owner) {
		return this.getAll().stream().filter(
				event -> event.getOwners().stream().map(Person::getId).filter(owner::equals).findFirst().isPresent())
				.collect(Collectors.toList());
	}

	public Optional<Event> getBySlug(String slug) {
		return this.findBy(where(equal("slug", slug))).stream().findFirst();
	}

	public List<Event> getByLocation(String location) {
		// return this.findBy(where(equal("location", location)));
		return this.getAll().stream().filter(event -> event.getPublishingDate() != null)
				.filter(event -> event.getLocation().toLowerCase().contains(location.toLowerCase()))
				.collect(Collectors.toList());

	}
}
