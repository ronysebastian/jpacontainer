/*
 * JPAContainer
 * Copyright (C) 2010 Oy IT Mill Ltd
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.vaadin.addon.jpacontainer.provider;

import com.vaadin.addon.jpacontainer.EntityProviderChangeEvent;
import com.vaadin.addon.jpacontainer.MutableEntityProvider;

/**
 * Event indicating that one or more entities have been updated.
 *
 * @author Petter Holmström (IT Mill)
 * @since 1.0
 */
class EntitiesUpdatedEvent<T> extends EntityEvent<T> implements EntityProviderChangeEvent.EntitiesUpdatedEvent<T> {

	private static final long serialVersionUID = -7472733082448613781L;

	public EntitiesUpdatedEvent(MutableEntityProvider<T> entityProvider,
			T... entities) {
		super(entityProvider, entities);
	}
}
