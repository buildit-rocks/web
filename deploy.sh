#!/bin/bash 

#PURPOSE: Deploys web-project to dotCloud
# -----------------------------------------------------------------------------

PROJ_NAME=buildit
APP_PATH=app/

#build self-package java-container
lein ring uberwar

#move package to app folder, which also includes settings for dotCloud
mv *.war app/ROOT.war 

#push project into production server
dotcloud push $PROJ_NAME $APP_PATH 


