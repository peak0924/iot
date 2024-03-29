/*******************************************************************************
 * Copyright (c) 2016, 2019 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * {@link KapuaNamedEntityCreator} definition.
 * <p>
 * The {@link KapuaNamedEntityCreator} adds on top of the {@link KapuaUpdatableEntityCreator} the following properties:
 * <ul>
 * <li>name</li>
 * <li>description</li>
 * </ul>
 *
 * </p>
 *
 * <div>
 *
 * <p>
 * <b>Name</b>
 * </p>
 * <p>
 * The <i>Name</i> property is the unique name of the {@link KapuaEntity} in the scope.
 * </p>
 *
 * <p>
 * <b>Description</b>
 * </p>
 * <p>
 * The <i>Description</i> property is the optional description of the {@link KapuaEntity}.
 * </p>
 * </div>
 *
 * @param <E> {@link KapuaEntity} which this {@link KapuaEntityCreator} is for
 * @since 1.0.0
 */
@XmlType(propOrder = {"name", "description"})
public interface KapuaNamedEntityCreator<E extends KapuaEntity> extends KapuaUpdatableEntityCreator<E> {

    /**
     * Gets the name
     *
     * @return the name
     * @since 1.0.0
     */
    @XmlElement(name = "name")
    String getName();

    /**
     * Sets the name
     *
     * @param name the name
     * @since 1.0.0
     */
    void setName(String name);

    /**
     * Gets the description
     *
     * @return the description
     * @since 1.0.0
     */
    String getDescription();

    /**
     * Sets the description
     *
     * @param description the description
     * @since 1.0.0
     */
    void setDescription(String description);
}
