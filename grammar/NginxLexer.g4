lexer grammar NginxLexer;


USER: 'user';
WORKER_PROCESSES: 'worker_processes';
ERROR_LOG: 'error_log';
WORKER_RLIMIT_NOFILE: 'worker_rlimit_nofile';
PID: 'pid';

// events
EVENTS: 'events';
USE: 'use';
WORKER_CONNECTIONS: 'worker_connections';

//// http
HTTP: 'http';
INCLUDE: 'include';
DEFAULT_TYPE: 'default_type';
LOG_FORMAT: 'log_format';
ACCESS_LOG: 'access_log';
SERVER_NAMES_HASH_BUCKET_SIZE: 'server_names_hash_bucket_size';
SERVER_NAME_IN_REDIRECT: 'server_name_in_redirect';
CLIENT_HEADER_BUFFER_SIZE: 'client_header_buffer_size';
LARGE_CLIENT_HEADER_BUFFERS: 'large_client_header_buffers';
SENDFILE: 'sendfile';
TCP_NOPUSH: 'tcp_nopush';
KEEPALIVE_TIMEOUT: 'keepalive_timeout';
CLIENT_HEADER_TIMEOUT: 'client_header_timeout';
CLIENT_BODY_TIMEOUT: 'client_body_timeout';
SEND_TIMEOUT: 'send_timeout';
GZIP: 'gzip';
GZIP_MIN_LENGTH: 'gzip_min_length';
GZIP_BUFFERS: 'gzip_buffers';
GZIP_HTTP_VERSION: 'gzip_http_version';
GZIP_COMP_LEVEL: 'gzip_comp_level';
GZIP_TYPES: 'gzip_types';
GZIP_VARY: 'gzip_vary';
PROXY_REDIRECT: 'proxy_redirect';
PROXY_SET_HEADER: 'proxy_set_header';
CLIENT_MAX_BODY_SIZE: 'client_max_body_size';
CLIENT_BODY_BUFFER_SIZE: 'client_body_buffer_size';
PROXY_CONNECT_TIMEOUT: 'proxy_connect_timeout';
PROXY_SEND_TIMEOUT: 'proxy_send_timeout';
PROXY_READ_TIMEOUT: 'proxy_read_timeout';
PROXY_BUFFER_SIZE: 'proxy_buffer_size';
PROXY_BUFFERS: 'proxy_buffers';
PROXY_BUSY_BUFFERS_SIZE: 'proxy_busy_buffers_size';
PROXY_TEMP_FILE_WRITE_SIZE: 'proxy_temp_file_write_size';
PROXY_NEXT_UPSTREAM: 'proxy_next_upstream';
PROXY_MAX_TEMP_FILE_SIZE: 'proxy_max_temp_file_size';
INDEX: 'index';

// SERVER
SERVER: 'server';
LISTEN: 'listen';
SERVER_NAME: 'server_name';
ROOT: 'root';
AUTOINDEX: 'autoindex';
AUTOINDEX_LOCALTIME: 'autoindex_localtime';
CHARSET: 'charset';
LOCATION: 'location';


LEFT_OPENING_BRACE: '{';
RIGTH_OPENING_BRACE: '}';
LOWER_STRING_WITH_UNDER_LINE: LOWER_STRING (UNDER_LINE LOWER_STRING)+;
LOWER_STRING: LOWER_ALPHABET+;
SPACE : ' ';
STRING_WITH_OTHER:  (LOWER_ALPHABET | UNDER_LINE | NUMBER |SLASH |DOUBLE_QUOTATION_MARK | LEFT_BRACKET | RIGHT_BRACKET
        |PLUS|MINUS|DOT | UPPER_ALPHABET | EQUALS_SIGN | DOLLER)+;
NUMBER: [0-9];
STRING: ALPHABET+ ;
LOWER_ALPHABET: [a-z];
UPPER_ALPHABET: [A-Z];
ALPHABET: [a-zA-Z];
UNDER_LINE: '_';

SLASH: '/';
PLUS: '+';
MINUS: '-';
DOT: '.';
EQUALS_SIGN: '=';
S1_DELIMITER : ';'      ; // S1 delimiter
SINGLE_QUOTATION_MARK: ['];
DOUBLE_QUOTATION_MARK: ["];
NOTES: '#';
DOLLER: '$';
LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';
NOTES_STRING: NOTES .*? '\n' -> skip ;
WS : [\t\r\n]+ -> skip ; // skip spaces, tabs, newlines

