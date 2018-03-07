/*
 * Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package java.util.function;

/**
 * Represents a supplier of results.
 *
 * <p>There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #get()}.
 *
 * @param <T> the type of results supplied by this supplier

 * @since 1.8
 */
@FunctionalInterface
public interface Supplier<T> {//提供结果: 当调用时,一个新的或不同的结果被返回(即再进行一次计算)

    /**
     * Gets a result.
     * *A supplier of objects. The result objects are either created
     * during the invocation of get() or by some prior action.
     * @return a result
     */
    T get();
}
