# android-architecture
A sample project to demonstrate a way to organize android project architecture
The project consists of different modules - app, business, common, data. Each module has it’s responsibility. The main thing is to setup the communication between the modules(mostly in case of long running asynchronous operations).

<b>Modules description:</b>

<h3><b>app</b></h3>
The application itself. Contains all the required android app components. Activity should only be used to host fragments for better app scalability and flexibility.

<b>activities</b> - all the activities here.

<b>fragments</b> - all the fragments here.

<b>views</b> - all the views here.

<b>services</b> - all the services here. Service has to provide execution of business layer functions and other specific operations.

<b>receivers</b> - all the broadcast receivers here(if such are needed).

<h3><b>business</b></h3>
Uses data layer to perform business logic specific operations: data retrieving from the server, data storing, data sending to the server, performing complicated data operations.

<h3><b>common</b></h3>
Contains utilities, notification layer(between app components). As a notification layer my suggestion is to use EventBus approach - notify subscribed app components once event occurred by the piece of information that is enough for subscriber. 

<h3><b>data</b></h3>
Contains the functionality to retrieve data from ws, save it locally(in db). Also has a model classes that are used in app module.

<b>api</b> - all the apis interfaces and implementation. Also contains RestApi interface and implementation - to provide basic REST methods(GET, POST, PUT, DELETE).

<b>api/model</b> - model classes that REST api reqires.

<b>dataprovider</b> - all the interfaces and implementations of classes to access data in db. Every entity has it’s own data provider.

<b>dataprovider/model</b> - model of the data stored in database. This module also will be used by app layer.
