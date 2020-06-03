package org.geekbang.time.commonmistakes.ch22_apidesign.apiasyncsyncmode;

import lombok.Data;

@Data
public class SyncUploadRequest {
    private byte[] file;
}
