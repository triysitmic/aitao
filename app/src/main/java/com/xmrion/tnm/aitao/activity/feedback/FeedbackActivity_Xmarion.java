package com.xmrion.tnm.aitao.activity.feedback;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.xmrion.tnm.aitao.activity.root.AiTaoActivityWithSingleFragment_Xmarion;

/**
 * Created by 郑艳达 on 2017/7/9.
 * 反馈
 */

public class FeedbackActivity_Xmarion extends AiTaoActivityWithSingleFragment_Xmarion {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.initialView(new FeedbackFragment_Xmarion());
    }
}
