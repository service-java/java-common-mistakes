package org.geekbang.time.commonmistakes.ch22_apidesign.apiasyncsyncmode;

import lombok.Data;

@Data
public class AsyncUploadRequest {
    private byte[] file;
}
