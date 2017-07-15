# Developed in Debian
# Pig exercise
The answer is the pig script file `query.pig`. 
## How to test in Pig local mode
The input data `movies.txt`, `us_data.txt` and this pig script should be in the same directory and, you are in this directory, then you can test it with command: `pig -x local query.pig`, then the output will be generated in a new directory called `pig_output`, whose sub-directories are self-explanatory

# Java exercise
In this README's directory, the related source code is in `src` directory. 
## Need the following software to compile and run
* Maven
* JRE 8
## How to run and check the result
To test and compile, run command `mvn package`. The result is the `.jar` in the generated `target` directory. Moreover, the `target/site/jacoco/index.html` displays the code coverage of the unit tests on the instruction level 
