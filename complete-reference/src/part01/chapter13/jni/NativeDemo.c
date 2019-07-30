#include <jni.h>
#include <stdio.h>
#include "part01_chapter13_jni_NativeDemo.h"

JNIEXPORT void JNICALL Java_part01_chapter13_jni_NativeDemo_test(JNIEnv *env, jobject obj)
{
    jclass cls;
    jfieldID fid;
    jint i;

    printf("В начале платформенно-ориентированного метода\n");

    cls = (*env)->GetObjectClass(env, obj);
    fid = (*env)->GetFieldID(env, cls, "i", "I");

    if (fid == 0) {
        printf("Невозможно получить идентификатор поля\n");
        return;
    }

    i = (*env)->GetIntField(env, obj, fid);
    printf("i = %d\n", i);

    (*env)->SetIntField(env, obj, fid, 3 * i);

    printf("В конце платформенно-ориентированного метода\n");
}
