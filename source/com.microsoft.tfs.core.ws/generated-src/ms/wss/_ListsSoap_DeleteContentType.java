// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.wss;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.wss._ListsSoap_DeleteContentType;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ListsSoap_DeleteContentType
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String listName;
    protected String contentTypeId;

    public _ListsSoap_DeleteContentType()
    {
        super();
    }

    public _ListsSoap_DeleteContentType(
        final String listName,
        final String contentTypeId)
    {
        // TODO : Call super() instead of setting all fields directly?
        setListName(listName);
        setContentTypeId(contentTypeId);
    }

    public String getListName()
    {
        return this.listName;
    }

    public void setListName(String value)
    {
        this.listName = value;
    }

    public String getContentTypeId()
    {
        return this.contentTypeId;
    }

    public void setContentTypeId(String value)
    {
        this.contentTypeId = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "listName",
            this.listName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "contentTypeId",
            this.contentTypeId);

        writer.writeEndElement();
    }
}
