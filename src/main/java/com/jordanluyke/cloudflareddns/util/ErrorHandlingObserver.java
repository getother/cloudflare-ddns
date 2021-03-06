package com.jordanluyke.cloudflareddns.util;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import org.apache.logging.log4j.LogManager;

public class ErrorHandlingObserver<T extends Object> implements Observer<T> {
    private Class<?> loggerClass;

    public ErrorHandlingObserver() {
        loggerClass = getClass();
    }

    @Override
    public void onComplete() {
    }

    @Override
    public void onNext(Object o) {
    }

    @Override
    public void onError(Throwable e) {
        LogManager.getLogger(loggerClass).error("Error: {}", e.getMessage());
    }

    @Override
    public void onSubscribe(Disposable disposable) {
    }
}