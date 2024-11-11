public class StringBufferBuilder {
    public static void main(String[] args) {
        // StringBuffer 
        StringBuffer stringBuffer = new StringBuffer("training");
        stringBuffer.append(" placement");
        System.out.println("StringBuffer: " + stringBuffer);
        stringBuffer.reverse();
        System.out.println("Reversed StringBuffer: " + stringBuffer);

        // StringBuilder 
        StringBuilder stringBuilder = new StringBuilder("here");
        stringBuilder.append(" we");
        System.out.println("StringBuilder: " + stringBuilder);
        stringBuilder.insert(7, " go again,");
        System.out.println("Modified StringBuilder: " + stringBuilder);
    }
}