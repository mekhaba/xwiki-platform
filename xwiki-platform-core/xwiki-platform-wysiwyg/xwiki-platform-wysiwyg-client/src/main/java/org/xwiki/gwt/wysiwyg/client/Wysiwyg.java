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
package org.xwiki.gwt.wysiwyg.client;

import org.xwiki.gwt.user.client.ui.rta.cmd.CommandManagerApi;
import org.xwiki.gwt.wysiwyg.client.gadget.GadgetWizardApi;

import com.google.gwt.core.client.EntryPoint;

/**
 * Publishes the JavaScript APIs to be used for creating and managing WYSIWYG editor instances.
 * 
 * @version $Id$
 */
public class Wysiwyg implements EntryPoint
{
    /**
     * {@inheritDoc}
     * 
     * @see EntryPoint#onModuleLoad()
     */
    public void onModuleLoad()
    {
        CommandManagerApi.publish();
        WysiwygEditorApi.publish();
        // TODO: this is not the right place for this, since the gadget API is used only by the dashboard
        GadgetWizardApi.publish();
    }
}
