# android-architecture
A sample project to demonstrate a way to organize android project architecture
The project consists of different modules - app, business, common, data. Each module has it’s responsibility. The main thing is to setup the communication between the modules(mostly in case of long running asynchronous operations).

Modules description:

app - the application itself. Contains all the required android app components. Activity should only be used to host fragments for better app scalability and flexibility.

activities - all the activities here
fragments - all the fragments here
views - all the views here
services - all the services here. Have to provide execution of business layer functions and other specific operations.
receivers - all the broadcast receivers here(if such are needed)

business - uses data layer to perform business logic specific operations: data retrieving from the server, data storing, data sending to the server, performing complicated data operations.

common - contains utilities, notification layer(between app components). As a notification layer my suggestion is to use EventBus approach - notify subscribed app components once event occurred by the piece of information that is enough for subscriber. 

data - contain the functionality to retrieve data from ws, save it locally(in db). Also has a model classes that are used in app module
api - all the apis interfaces and implementation. Also contains RestApi interface and implementation - to provide basic REST methods(GET, POST, PUT, DELETE)
api/model - model classes that REST api requires
dataprovider - all the interfaces and implementations of classes to access data in db. Every entity has it’s own data provider
dataprovider/model - model of the data stored in database. This module also will be used by app layer
