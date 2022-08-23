package io.github.josealmir.fp;

public class EitherDemo {
    public static void main(String[] args) {
        div(1, 0).fold((ex) -> -1, (result) -> result);
    }


    public static Either<RuntimeException, Integer> div(Integer a, Integer b) {
        if (b == 0) return Either.left(new RuntimeException("Não é possível dividir por zero"));
        return Either.right(a / b);
    }
}
