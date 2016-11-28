//
// Created by tts on 11/29/16.
//

#ifndef MYAPPLICATION_HELLO_JNI_H
#define MYAPPLICATION_HELLO_JNI_H

#include <string.h>
#include <jni.h>

jstring Java_com_example_tts_myapplication_MainActivity_stringFromJNI( JNIEnv* env,
                                                                       jobject thiz );

#endif //MYAPPLICATION_HELLO_JNI_H
