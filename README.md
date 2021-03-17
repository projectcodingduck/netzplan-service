Netzplan Calculator
==========

== Description
- Netzplan calculator is a small java console programm to calculate all node attributes from given operation list.
- NOTE: Calculator only works if the nodes have previous node(s).

== Requirements
- maven
- java >= 1.8

== Setup & Build
1. `mvn clean install` build project

== How to use 
1. create `Netzplan` with `operation list` in `TestDataFactory.createNP0(nodes)`
2. call `createNP0`  in `Start.main`
3. `run application`

== Other
- some netzpläne with results can be found in resource dir
- do not use Arrays.asList()

== Test
- unit test available