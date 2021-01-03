#!/usr/bin/env bash

export CLASSPATH=".:/usr/share/java/antlr-complete.jar:$CLASSPATH"

# shellcheck disable=SC2164
SCRIPT_PATH="$( cd "$(dirname "$0")" >/dev/null 2>&1 ; pwd -P )"
ROOT_PATH=$(dirname "${SCRIPT_PATH}")

ANTLR4_DEBUG_GUI_PATH="${ROOT_PATH}"/cmake-build-debug/antlr4_debug_gui
mkdir -p "${ANTLR4_DEBUG_GUI_PATH}"

antlr4 -o "${ANTLR4_DEBUG_GUI_PATH}" -no-listener -Dlanguage=Java "${ROOT_PATH}"/grammar/NginxLexer.g4
antlr4 -o "${ANTLR4_DEBUG_GUI_PATH}" -no-listener -Dlanguage=Java "${ROOT_PATH}"/grammar/NginxParser.g4

cd "${ANTLR4_DEBUG_GUI_PATH}" || exit

rm -f ./*.class
javac ./*.java

grun Nginx input -tokens -gui < /home/lu/Downloads/nginx_demo_v2_20201226_by_lyuqiang/nginx_demo/text.conf