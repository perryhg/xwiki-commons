/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.extension.repository.internal.core;

import java.net.URL;

import org.apache.maven.model.Model;
import org.xwiki.extension.ExtensionId;

/**
 * Extends {@link DefaultCoreExtension} with Maven related informations.
 * 
 * @version $Id$
 * @since 4.0M1
 */
public class MavenCoreExtension extends DefaultCoreExtension
{
    /**
     * The associated to the Maven model object.
     */
    public static final String PKEY_MAVEN_MODEL = "maven.Model";

    /**
     * @param repository the core extension repository
     * @param url the core extension URL
     * @param id the id/version combination which makes the extension unique
     * @param type the type of the extension
     * @param mavenModel the Maven model
     */
    public MavenCoreExtension(DefaultCoreExtensionRepository repository, URL url, ExtensionId id, String type,
        Model mavenModel)
    {
        super(repository, url, id, type);

        putProperty(PKEY_MAVEN_MODEL, mavenModel);
    }
    
    /**
     * @return the Maven model object
     */
    public Model getMavenModel()
    {
        return (Model) getProperty(PKEY_MAVEN_MODEL);
    }
}
