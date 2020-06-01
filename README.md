# About
This implementation was done as part of coursework at my school. Hence the scope of the RMI implementation is limited.  
This is a RMI (Remote Method Invocation) implementation in Java, with server side authentication, using password hashing,
and access control. 

# Task
The resource being shared is that of a printer, which is trying to be accessed remotely. But different User Roles
have different permissions, and also passwords must be stored in a safe and secure manner than readable verbatim passwords.
Moreover, the roles of different users should be maintained using text files, so that it is easy to edit, and maintain. 

For this task, I have made this implementation in java. I am storing passwords in 

# Credits 
The package used for password hashing is taken from - [jBCrypt]{https://github.com/jeremyh/jBCrypt} and is included in the namespace,
which is an implementation of the OpenBSD Blowfish Hashing algorithm. 
