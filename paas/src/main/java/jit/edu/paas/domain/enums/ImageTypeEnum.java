package jit.edu.paas.domain.enums;

import lombok.Getter;

/**
 * 镜像类型枚举
 * @author jitwxs
 * @since 2018/6/5 23:53
 */
@Getter
public enum ImageTypeEnum {
    LOCAL_PUBLIC_IMAGE("本地公共镜像", 1),
    LOCAL_USER_IMAGE("本地用户镜像", 2);

    private String message;
    private int code;

    ImageTypeEnum(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public static String getMessage(int code) {
        for (ImageTypeEnum enums : ImageTypeEnum.values()) {
            if (enums.getCode() == code) {
                return enums.message;
            }
        }
        return null;
    }
}
