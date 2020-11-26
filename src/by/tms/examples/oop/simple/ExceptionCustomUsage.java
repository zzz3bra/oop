package by.tms.examples.oop.simple;

public class ExceptionCustomUsage {
    public static void main(String[] args) throws CustomCheckedException {
        throwChecked();
        throwUnchecked();
    }

    private static void throwUnchecked() throws CustomUncheckedException {//optional syntax
        throw new CustomUncheckedException();
    }

    private static void throwChecked() throws CustomCheckedException, RuntimeException { // multiple exceptions
        throw new CustomCheckedException("custom message");
    }
}
