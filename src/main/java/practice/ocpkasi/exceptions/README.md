## *Multi-catch*
Rules:
* Java intends multi-catch to be used for exceptions that aren't related 
	* => One exception in *multi-catch* cannot be the subclass of any other excpetion in the same *multi-catch*. For instance, `catch(FileNotFound | IOException e){}` causes compilation error because, `FileNotFoundException extends IOExceptio`
* *Mmulti-catch* is *effectively final*  
