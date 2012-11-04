# Tycho Demo

A simple tycho demo. The demo shows:
 
 1. How to build a p2 repository and how to integrate other maven OSGi bundles in a P2 repository.

 2. How to build a OSGi bundle with tycho

 3. How to build a eclipse feature project with tycho

 4. How to build a eclipse (equinox) based OSGi product

 5. How to run eclipse plug-in tests in tycho

## Build Project 

Requires apache maven version >= 3.X

1. Build the P2 repository (Internet connection is needed)

   mvn package -Prepository
   
2. Build the bundle and product (no online p2 repository is needed)

   mvn install

## Links

- http://wiki.eclipse.org/Tycho/Reference_Card
- http://wiki.eclipse.org/Tycho/Packaging_Types
- http://eclipsesource.com/blogs/2012/09/11/running-httprest-integration-tests-in-an-eclipse-tycho-build/
- https://github.com/eclipse/tycho-demo
- https://github.com/jsievers/tycho-demo
