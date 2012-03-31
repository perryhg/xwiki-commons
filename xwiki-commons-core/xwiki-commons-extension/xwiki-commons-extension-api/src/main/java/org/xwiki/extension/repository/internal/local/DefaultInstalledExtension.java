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
package org.xwiki.extension.repository.internal.local;

import org.xwiki.extension.InstalledExtension;
import org.xwiki.extension.LocalExtension;
import org.xwiki.extension.repository.ExtensionRepository;
import org.xwiki.extension.repository.InstalledExtensionRepository;
import org.xwiki.extension.wrap.WrappingLocalExtension;

/**
 * Default implementation of {@link LocalExtension}.
 * <p>
 * TODO: For now it's wrapping a {@link LocalExtension} but it should be independent in the future and
 * {@link LocalExtension} should loose all installation related informations and only keep storage informations.
 * 
 * @version $Id$
 */
public class DefaultInstalledExtension extends WrappingLocalExtension<LocalExtension> implements InstalledExtension
{
    /**
     * The wrapped local extension.
     */
    private InstalledExtensionRepository repository;

    /**
     * @param localExtension the wrapped local extension
     * @param repository the repository
     */
    public DefaultInstalledExtension(LocalExtension localExtension, InstalledExtensionRepository repository)
    {
        super(localExtension);

        this.repository = repository;
    }

    @Override
    public ExtensionRepository getRepository()
    {
        return this.repository;
    }
}