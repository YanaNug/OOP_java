class ComplexNum {
    double real;
    double imaginary;

    ComplexNum(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        if (imaginary == 0) {
            return String.format("%.2f", real);
        } else if (real == 0) {
            return String.format("%.2fi", imaginary);
        } else if (imaginary < 0) {
            return String.format("%.2f - %.2fi", real, Math.abs(imaginary));
        } else {
            return String.format("%.2f + %.2fi", real, imaginary);
        }
    }
}