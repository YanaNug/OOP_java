class Division extends Operation {
    @Override
    ComplexNum execute(ComplexNum num1, ComplexNum num2) {
        double denominator = num2.real * num2.real + num2.imaginary * num2.imaginary;
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return new ComplexNum((num1.real * num2.real + num1.imaginary * num2.imaginary) / denominator,
                (num1.imaginary * num2.real - num1.real * num2.imaginary) / denominator);
    }
}