/* Exceptions: 
Recoverable by programmer.
Exceptions occurs at execution.
try{
Read the data from the file located at USA.}
Catch(File not found exception e)
{Use local file and continue rest of the program normally.}


Errors:l
Not Recoverable by programmer. 
Out of memory
Stack overflow
JVM crash 

Exceptions: -> Checked Exceptions
            -> Unchecked Exceptions
            
If we want the complete information about exception then we use out(e.toString())
out(e) gives name of exception and it's description
out(e.getMessage) gives description only

Throw keyword: It handover our created exception object to the JVM manually
Throws Keyword: */


