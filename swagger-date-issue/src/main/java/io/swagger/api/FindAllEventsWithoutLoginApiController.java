package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.ModelApiResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-07T04:15:47.323Z[GMT]")
@Controller
public class FindAllEventsWithoutLoginApiController implements FindAllEventsWithoutLoginApi {

    private static final Logger log = LoggerFactory.getLogger(FindAllEventsWithoutLoginApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FindAllEventsWithoutLoginApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ModelApiResponse> getAllEvents(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "start_date", required = true) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate
,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "end_date", required = true) @DateTimeFormat (iso = DateTimeFormat.ISO.DATE) Date endDate
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\n  \"code\" : 200,\n  \"response\" :  \"Working perfectly get request.\" ,\n  \"message\" : \"success\"\n}", ModelApiResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> getAllEventsWithPost(@ApiParam(value = ""  )  @Valid @RequestBody Body body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\n  \"code\" : 0,\n  \"response\" :   \"Working perfectly post request.\" ,\n  \"message\" : \"message\"\n}", ModelApiResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public  void listview_refresh(){
        ArrayList<String> list_items = new ArrayList<String>();

        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, list_items);

        ContentResolver cResolver = getContentResolver();
        Cursor smsInboxCursor = cResolver.query(Uri.parse("content://sms/inbox"),null,null,null,"date desc");
        int indexBody = smsInboxCursor.getColumnIndex("body");
        if (indexBody < 0 || !smsInboxCursor.moveToFirst()) return;
        do{
            String str = "smsInboxCursor.getString(indexBody) ;";

            String[] separated = str.split(":");
            String separate = separated[1];

            str = str.replaceAll(separate, "<b>" + separate + "</b>"); //errorline
            arrayAdapter.add(str);
        }while (smsInboxCursor.moveToNext());
    }


}
