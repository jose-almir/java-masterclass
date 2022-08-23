package io.github.josealmir.fp;

public sealed abstract class Either<L, R> permits Either.Left, Either.Right {

    public <B> B fold(Projection<L, B> onLeft, Projection<R, B> onRight) {
        if (this instanceof Either.Left<L, R>) {
            return onLeft.onValue(((Left<L, R>) this).value);
        } else {
            return onRight.onValue(((Right<L, R>) this).value);
        }
    }

    public static final class Left<L, R> extends Either<L, R> {
        private final L value;

        public Left(L value) {
            this.value = value;
        }
    }

    public static final class Right<L, R> extends Either<L, R> {
        private final R value;

        public Right(R value) {
            this.value = value;
        }
    }

    public static <A, B> Either.Left<A, B> left(A value) {
        return new Either.Left<>(value);
    }

    public static <A, B> Either.Right<A, B> right(B value) {
        return new Either.Right<>(value);
    }

    interface Projection<T, P> {
        P onValue(T value);
    }
}