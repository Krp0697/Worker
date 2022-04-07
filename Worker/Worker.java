package Worker;

public class Worker {
    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i < 101; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " is error");
            } else callback.onDone("Task " + i + " is done");
        }
    }
}
