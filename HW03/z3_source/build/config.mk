PREFIX=/home/gzhang/CS383/HW03/bin
CC=gcc
CXX=g++
CXXFLAGS= -D_MP_INTERNAL -DNDEBUG -D_EXTERNAL_RELEASE  -std=c++20 -fvisibility=hidden -fvisibility-inlines-hidden -c -mfpmath=sse -msse -msse2 -O3 -fPIC
CFLAGS= -D_MP_INTERNAL -DNDEBUG -D_EXTERNAL_RELEASE   -fvisibility=hidden -fvisibility-inlines-hidden -c -mfpmath=sse -msse -msse2 -O3 -fPIC
EXAMP_DEBUG_FLAG=
CXX_OUT_FLAG=-o 
C_OUT_FLAG=-o 
OBJ_EXT=.o
LIB_EXT=.a
AR=ar
AR_FLAGS=rcs
AR_OUTFLAG=
EXE_EXT=
LINK=g++
LINK_FLAGS=
LINK_OUT_FLAG=-o 
LINK_EXTRA_FLAGS=-lpthread 
SO_EXT=.so
SLINK=g++
SLINK_FLAGS=-shared
SLINK_EXTRA_FLAGS=-lpthread  -Wl,-soname,libz3.so
SLINK_OUT_FLAG=-o 
OS_DEFINES=
