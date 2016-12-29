
all : 
	gcc -m64 -shared -c src/main/c/stub.c -o target/libstub.so
