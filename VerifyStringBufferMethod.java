import java.lang.reflect.Method;

public class VerifyStringBufferMethod {
    public static void main(String[] args) {
        try {
            // Get the Class object for StringBuffer
            Class<?> stringBufferClass = StringBuffer.class;

            // Get the desired method name
            String methodName = "append"; // Example method name

            // Get all the methods declared in StringBuffer class
            Method[] methods = stringBufferClass.getDeclaredMethods();

            // Check if the method belongs to StringBuffer class
            boolean isStringBufferMethod = false;
            for (Method method : methods) {
                if (method.getName().equals(methodName)) {
                    isStringBufferMethod = true;
                    break;
                }
            }

            // Print the result
            if (isStringBufferMethod) {
                System.out.println("'" + methodName + "' method belongs to StringBuffer class.");
            } else {
                System.out.println("'" + methodName + "' method does not belong to StringBuffer class.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
