###Applying Java Plugin
* Add following line in build.gradle on top.
	```apply plugin: java```
* run build task
	```$./gradlew build```
	Running build task for the first time will download all the dependencies required for the project. For the first time it'll get gradle too. In our case, we don't have any dependency declared as of now, so nothing else shall be downloaded.

Once the Java plugin is applied to the project, try listing the tasks:
```$./gradlew tasks```
You'll notice more tasks in the list under section "build tasks", "documentation", "build setup", etc. These came just by applying the java plugin.

###Applying Eclipse Plugin
* Add following line in build.gradle on top.
	```apply plugin: eclipse```
* run build task
	```$./gradlew build```

Do the same to list the tasks after applying the plugin and see what new tasks are available now.

###Eclipse Project Import
* Open eclipse.
* Open  the git repository view (Window -> Show view -> Other -> Git Repositories).
* Add the repository using "Add an existing local repository".
* Then using "import existing project", import the project. 

You'll notice the project is all set for eclipse.

###Getting dependencies



	