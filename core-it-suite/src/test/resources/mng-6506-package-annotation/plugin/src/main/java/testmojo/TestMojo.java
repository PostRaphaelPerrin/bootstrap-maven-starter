package testmojo;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo( name = "test" )
public class TestMojo extends AbstractMojo
{
    public void execute() throws MojoExecutionException, MojoFailureException
    {
        TestAnnotation ann = TestMojo.class.getPackage().getAnnotation( TestAnnotation.class );
        if ( ann == null )
        {
            throw new MojoFailureException( "Failed to retrieve package annotation" );
        }
        else
        {
            getLog().info( "MNG-6506 check succeeded" );
        }
    }
}
