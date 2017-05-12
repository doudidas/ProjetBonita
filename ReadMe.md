Course_Project

***Property rental process for a real estate agency***

===== Requirement =====

- Stable version of Java ( 1.7.x or 1.8.x)
- An IDE to run processes such as EclipseEE or Inteliji
- A TomCat server (1.7.x) with ode
- BonitaBPMCommunity, version 6.5.4
- Maven for the REST service

===== Installation =====

- You can find the whole project on project.zip
- you can download directly source code from :
https://github.com/doudidas/ProjetBonita.git



=== Import the project ===

Open Bonita and import the file design workflow MyProject.bos

Open eclipse and import the REST, SOAP and BPEL projects that contains :

 - The SOAP service to make the first decision
 - The REST service to generate the risk level for the customer financial profile
 - BPEL process to make the second decision

=== Configuration ===

- Configure each processes on a different port to allow multiple access on the same computer

=== Run the project ===

Run the projects on eclipse

On Bonita , click Run to launch the process

== More content ==

https://github.com/doudidas/angularWebREST.git Angular form with to REST user
