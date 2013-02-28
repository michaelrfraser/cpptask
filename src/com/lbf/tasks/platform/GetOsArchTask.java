/*
 *   Copyright 2013 The Portico Project
 *
 *   This file is part of cpptask.
 *
 *   cpptask is free software; you can redistribute it and/or modify
 *   it under the terms of the Common Developer and Distribution License (CDDL) 
 *   as published by Sun Microsystems. For more information see the LICENSE file.
 *
 *   Use of this software is strictly AT YOUR OWN RISK!!!
 *   If something bad happens you do not have permission to come crying to me.
 *   (that goes for your lawyer as well)
 *
 */
package com.lbf.tasks.platform;

import org.apache.tools.ant.Task;

import com.lbf.tasks.utils.Arch;
import com.lbf.tasks.utils.PropertyUtils;

/**
 * Gets the {@link Arch} of the underyling operating system. We determine the architecture
 * by calling {@link Arch#getOsArch()}. The value is stored in property of the identified
 * name (defaults to "os.arch").
 */
public class GetOsArchTask extends Task
{
	//----------------------------------------------------------
	//                    STATIC VARIABLES
	//----------------------------------------------------------

	//----------------------------------------------------------
	//                   INSTANCE VARIABLES
	//----------------------------------------------------------
	private String property;

	//----------------------------------------------------------
	//                      CONSTRUCTORS
	//----------------------------------------------------------
	public GetOsArchTask()
	{
		this.property = "os.arch";
	}

	//----------------------------------------------------------
	//                    INSTANCE METHODS
	//----------------------------------------------------------
	
	public void execute()
	{
		PropertyUtils.setProjectProperty( getProject(),
		                                  property,
		                                  Arch.getOsArch().toString(),
		                                  false );
	}

	////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////// Accessor and Mutator Methods ///////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////
	public void setProperty( String property )
	{
		this.property = property;
	}

	//----------------------------------------------------------
	//                     STATIC METHODS
	//----------------------------------------------------------
}
