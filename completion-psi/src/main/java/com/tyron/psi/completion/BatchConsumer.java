package com.tyron.psi.completion;

import org.jetbrains.kotlin.com.intellij.util.Consumer;

/**
 * Pass an implementation of this interface to {@link CompletionService#performCompletion(CompletionParameters, Consumer)} to receive
 * updates when each batch of completion items generated by a completion contributor is done.
 */
public interface BatchConsumer<T> extends Consumer<T> {
    default void startBatch() {}
    default void endBatch() {}
}