
public class Exercise_05 {
	/*
	 * The term exception is shorthand for the phrase "exceptional event." When an
	 * error occurs within a method, the method creates an object and hands it off
	 * to the runtime system. The object, called an exception object, contains
	 * information about the error, including its type and the state of the program
	 * when the error occurred. Creating an exception object and handing it to the
	 * runtime system is called throwing an exception.
	 * 
	 * After a method throws an exception, the runtime system attempts to find
	 * something to handle it. The set of possible "somethings" to handle the
	 * exception is the ordered list of methods that had been called to get to the
	 * method where the error occurred. The list of methods is known as the call
	 * stack. The runtime system searches the call stack for a method that contains
	 * a block of code that can handle the exception. This block of code is called
	 * an exception handler. The search begins with the method in which the error
	 * occurred and proceeds through the call stack in the reverse order in which
	 * the methods were called. When an appropriate handler is found, the runtime
	 * system passes the exception to the handler. An exception handler is
	 * considered appropriate if the type of the exception object thrown matches the
	 * type that can be handled by the handler.
	 */
}
