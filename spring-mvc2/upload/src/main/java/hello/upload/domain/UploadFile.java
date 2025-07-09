package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    // 중복 이름 저장을 방지하기 위해 사용자 업로드(uploadFileName), 서버 저장(storeFileName)을 구분한다.
    private String uploadFileName;
    private String storeFileName;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
