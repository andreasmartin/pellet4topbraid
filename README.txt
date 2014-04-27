Pellet4TopBraid: An OpenSource TopBraid Plug-in for the Pellet Reasoner
-----------------------------------------------------------------------

pellet4topbraid is a plugin to the TopBraid platform that provides a bridge to the Pellet
reasoner.  The Pellet reasoner will appear in the list of "Additional Inference Engines"
under the "Inference > Configure Inferencing..." dialog window.


Installation
------------
Two methods of installation are available for the plug-in.  The simplest method will be to use
install the plug-in with the TopBraid Composer menu system:

  1) Help > Install New Software...

  2) Click "Add..."

  3) In the "Name" field, enter a descriptive name that you will recognize later such as
     "Pellet Plug-in for TopBraid".

  4) In the "Location" field enter the URL:  http://update.seman.tc/p4tb/
  
  5) Click "OK"
  
  6) "Pellet Plug-in for TopBraid" will now appear with a triangle menu and a check box.
     Click the triangle menu to see available plug-in options below, click the plug-in that
     is appropriate for your version of TopBraid Composer.
     
  7) An installation wizard will now initiate that requires you to accept the Affero
     distribution license (the same license used by Pellet).
     
     
An alternate method of installation is to download the plug-in from its repository website
and manually install it into TopBraid's installation (aka "home") directory.  Steps for
this approach are:

  1) Visit the web page: http://code.google.com/p/pellet4topbraid/downloads/list
  
  2) Select and download version of the plug-in that is appropriate for your version of
     TopBraid Composer.  Save the plug-in in a directory that you will remember.
     
  3) Open the directory where you have saved the plug-in, and move into the "plugins"
     directory under your TopBraid Composer installation directory (the directory form which
     you launch TopBraid Composer).
     
  4) Restart TopBraid Composer if it is running.



Usage
-----
TopBraid Composer supports reasoner configuration against individual ontology files.
To set Pellet as your preferred reasoner for a given ontology file, first load the file
in TopBraid Composer and make sure that the ontology is in in the foreground editor tab.
If your ontology has the filename "myFile.owl" you will see it in tab label.

Follow these menu steps to configure Pellet as your ontology reasoner:

  1) Inference > Configure Inferencing...
  
  2) Check the box: Customize settings for "myFile.owl"

  3) In the "Additional Inference Engines" select "Pellet 2.3.0" and click "Add >>"
  
  4) Pellet 2.3.0 will now appear in a reasoner block appearing after the default reasoner,
     SwiftOWLIM.
     
  5) Click the "SwitftOWLIM" block and it will highlight, click the "X" icon to remove the
     SwiftOWLIM reasoner leaving only Pellet.
     
  6) Click the "Close" button.
  
  7) You will notice in the editor tab that the ontology filename now appears as "myFile.owl*",
     the "*" indicates a modification has occurred. Save the ontology.  The new configuration
     setting will now be saved in the companion file "myFile.owl.tbc", the ontology file
     itself has not been modified in this process.
     
The Pellet reasoner is now applied when the "Run Inference" button is clicked.


Building
--------
The Pellet for TopBraid source code resides in a Git repository and may be browsed under
the project homepage. The code tree may be retrieved with a Git client via the command:


  git clone https://code.google.com/p/pellet4topbraid/

The code tree itself is valid Eclipse project and should be imported into an eclipse workspace
to build the plug-in.  Once imported into the workspace the project source files will compile
automatically. The plug-in itself, as a stand alone .jar file, is created itself via the
export sequence beginning with:

  File > Export... > Deployable plug-ins and fragments > Next > (check the plug-in and select a
  target folder)

See the Installation section for instructions for installing the plug-in.

