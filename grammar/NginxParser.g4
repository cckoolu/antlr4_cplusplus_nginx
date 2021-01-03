parser grammar NginxParser;


options {
    tokenVocab = NginxLexer;
}

input : all_string input
      | EOF;

// 所有内容
all_string: notes_string|field_group_ordinary|context_events|context_http;

// 注释内容
notes_string: NOTES_STRING ;

// 普通的s1项
field_group_ordinary: fg_left_ordinary (SPACE+ fg_right)+ S1_DELIMITER SPACE*  ;
fg_left_ordinary: USER|WORKER_PROCESSES|ERROR_LOG|WORKER_RLIMIT_NOFILE|PID;


// EVENTS
context_events: context_name_events SPACE* context_value_events ;
context_name_events: EVENTS;
context_value_events: LEFT_OPENING_BRACE  (SPACE|field_group_events|notes_string|location+)* RIGTH_OPENING_BRACE ;
// EVENTS 可包含内容
field_group_events: fg_left_events (op=SPACE+ fg_right)+ S1_DELIMITER ;
fg_left_events: USE| WORKER_CONNECTIONS;

// HTTP
context_http: context_name_http SPACE* context_value_http ;
context_name_http: HTTP;
context_value_http: LEFT_OPENING_BRACE  (SPACE|field_group_http|notes_string|location+|field_group_one|field_group_two)* RIGTH_OPENING_BRACE ;
// HTTP 可包含内容
field_group_http: field_group_http_one|field_group_http_two;
field_group_http_one: fg_left_http (op=SPACE+ fg_right)+ S1_DELIMITER ;
fg_left_http: INCLUDE|LOG_FORMAT|ACCESS_LOG|SERVER_NAMES_HASH_BUCKET_SIZE|SERVER_NAME_IN_REDIRECT|CLIENT_HEADER_BUFFER_SIZE|LARGE_CLIENT_HEADER_BUFFERS|SENDFILE|TCP_NOPUSH|KEEPALIVE_TIMEOUT|CLIENT_HEADER_TIMEOUT
               |CLIENT_BODY_TIMEOUT|SEND_TIMEOUT|GZIP|GZIP_MIN_LENGTH|GZIP_BUFFERS|GZIP_HTTP_VERSION|GZIP_COMP_LEVEL|GZIP_TYPES|PROXY_REDIRECT
               |PROXY_SET_HEADER|CLIENT_MAX_BODY_SIZE|CLIENT_BODY_BUFFER_SIZE|PROXY_CONNECT_TIMEOUT|PROXY_SEND_TIMEOUT|PROXY_READ_TIMEOUT
               |PROXY_BUFFER_SIZE|PROXY_BUFFERS|PROXY_BUSY_BUFFERS_SIZE|PROXY_TEMP_FILE_WRITE_SIZE|PROXY_NEXT_UPSTREAM|PROXY_MAX_TEMP_FILE_SIZE
               |INDEX|GZIP_VARY ;

// SERVER
field_group_http_two: context_name_server (op=SPACE+ context_value_server)+ ;
context_name_server: SERVER;
context_value_server: LEFT_OPENING_BRACE (SPACE|field_group_server|notes_string|location+|field_group_one|field_group_two)* RIGTH_OPENING_BRACE ;

// SERVER 可包含内容
field_group_server: fg_left_server (op=SPACE+ fg_right)+ S1_DELIMITER ;
fg_left_server: LISTEN|SERVER_NAME|ROOT|AUTOINDEX|AUTOINDEX_LOCALTIME|CHARSET;

// 特殊的可包含内容
field_group_one: DEFAULT_TYPE (op=SPACE+ fg_right)+ S1_DELIMITER ;
field_group_two: ACCESS_LOG (op=SPACE+ fg_right)+ S1_DELIMITER ;

// ALL-fg_right
fg_right: LOWER_STRING |LOWER_STRING_WITH_UNDER_LINE|  STRING | STRING_WITH_OTHER | SINGLE_QUOTATION_MARK (STRING_WITH_OTHER SPACE*)+  SINGLE_QUOTATION_MARK;

// SERVER 下 location 项
location: location_left_field op=SPACE location_middle_field op=SPACE location_right_field ;
location_left_field: LOCATION;
location_middle_field: STRING_WITH_OTHER;
location_right_field: LEFT_OPENING_BRACE  (SPACE|notes_string)* RIGTH_OPENING_BRACE ;