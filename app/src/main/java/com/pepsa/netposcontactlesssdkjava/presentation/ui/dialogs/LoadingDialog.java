package com.pepsa.netposcontactlesssdkjava.presentation.ui.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.pepsa.netposcontactlesssdkjava.R;
import com.pepsa.netposcontactlesssdkjava.databinding.LayoutLoadingDialogBinding;

public class LoadingDialog extends DialogFragment {
    private String loadingMessage;
    public void setLoadingMessage(String loadingMessage) {
        this.loadingMessage = loadingMessage;
    }

    private LayoutLoadingDialogBinding binding;

    public LoadingDialog() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.layout_loading_dialog, container, false);
        setLoadingMessage("Processing...");
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.loadingMessage.setText(loadingMessage);
        if (getDialog() != null && getDialog().getWindow() != null) {
            getDialog().getWindow().setBackgroundDrawableResource(R.drawable.curve_bg);
            getDialog().setCancelable(false);
        }
    }
}
