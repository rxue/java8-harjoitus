## `java.nio.file.Path`
The essence of `Path`:
* *immutable*
* it is an abstract concept, meaning its methods do not operate on actual *file system*
	* the *path* of `Path` object might not exist physically, invoking mehtods of `Path` can still work
	* the actually operations on *file system* can be executed with those *static methods* on *utility class* `java.nio.file.Files` 
