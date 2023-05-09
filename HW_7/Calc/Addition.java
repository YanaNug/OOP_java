class Addition extends Operation {
    @Override
    ComplexNum execute(ComplexNum num1, ComplexNum num2) {
        return new ComplexNum(num1.real + num2.real, num1.imaginary + num2.imaginary);
    }
}