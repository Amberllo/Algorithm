#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_ndkapplication_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT jintArray JNICALL
Java_com_example_ndkapplication_MainActivity_quicksortTestFromJNI(JNIEnv *env, jobject thiz,
                                                                  jintArray int_array) {
//    int size = sizeof(int_array)
    return env->NewIntArray(4);

}