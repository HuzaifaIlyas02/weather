// Generated by view binder compiler. Do not edit!
package com.example.check_weather.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.check_weather.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAboutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialCardView cardView;

  @NonNull
  public final FloatingActionButton closeButton;

  @NonNull
  public final ExtendedFloatingActionButton englishButton;

  @NonNull
  public final LinearLayout expandLayout;

  @NonNull
  public final NestedScrollView nestedScrollView;

  @NonNull
  public final SwitchCompat nightModeSwitch;

  @NonNull
  public final ExtendedFloatingActionButton persianButton;

  @NonNull
  public final TextView textApplicationInfo;

  @NonNull
  public final TextView textDesignApi;

  @NonNull
  public final TextView textDeveloperInfo;

  @NonNull
  public final TextView textLibraries;

  @NonNull
  public final TextView textLicense;

  @NonNull
  public final ImageButton toggleInfoButton;

  @NonNull
  public final LinearLayout toggleInfoLayout;

  private FragmentAboutBinding(@NonNull LinearLayout rootView, @NonNull MaterialCardView cardView,
      @NonNull FloatingActionButton closeButton,
      @NonNull ExtendedFloatingActionButton englishButton, @NonNull LinearLayout expandLayout,
      @NonNull NestedScrollView nestedScrollView, @NonNull SwitchCompat nightModeSwitch,
      @NonNull ExtendedFloatingActionButton persianButton, @NonNull TextView textApplicationInfo,
      @NonNull TextView textDesignApi, @NonNull TextView textDeveloperInfo,
      @NonNull TextView textLibraries, @NonNull TextView textLicense,
      @NonNull ImageButton toggleInfoButton, @NonNull LinearLayout toggleInfoLayout) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.closeButton = closeButton;
    this.englishButton = englishButton;
    this.expandLayout = expandLayout;
    this.nestedScrollView = nestedScrollView;
    this.nightModeSwitch = nightModeSwitch;
    this.persianButton = persianButton;
    this.textApplicationInfo = textApplicationInfo;
    this.textDesignApi = textDesignApi;
    this.textDeveloperInfo = textDeveloperInfo;
    this.textLibraries = textLibraries;
    this.textLicense = textLicense;
    this.toggleInfoButton = toggleInfoButton;
    this.toggleInfoLayout = toggleInfoLayout;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_about, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAboutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_view;
      MaterialCardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.close_button;
      FloatingActionButton closeButton = ViewBindings.findChildViewById(rootView, id);
      if (closeButton == null) {
        break missingId;
      }

      id = R.id.english_button;
      ExtendedFloatingActionButton englishButton = ViewBindings.findChildViewById(rootView, id);
      if (englishButton == null) {
        break missingId;
      }

      id = R.id.expand_layout;
      LinearLayout expandLayout = ViewBindings.findChildViewById(rootView, id);
      if (expandLayout == null) {
        break missingId;
      }

      id = R.id.nested_scroll_view;
      NestedScrollView nestedScrollView = ViewBindings.findChildViewById(rootView, id);
      if (nestedScrollView == null) {
        break missingId;
      }

      id = R.id.night_mode_switch;
      SwitchCompat nightModeSwitch = ViewBindings.findChildViewById(rootView, id);
      if (nightModeSwitch == null) {
        break missingId;
      }

      id = R.id.persian_button;
      ExtendedFloatingActionButton persianButton = ViewBindings.findChildViewById(rootView, id);
      if (persianButton == null) {
        break missingId;
      }

      id = R.id.text_application_info;
      TextView textApplicationInfo = ViewBindings.findChildViewById(rootView, id);
      if (textApplicationInfo == null) {
        break missingId;
      }

      id = R.id.text_design_api;
      TextView textDesignApi = ViewBindings.findChildViewById(rootView, id);
      if (textDesignApi == null) {
        break missingId;
      }

      id = R.id.text_developer_info;
      TextView textDeveloperInfo = ViewBindings.findChildViewById(rootView, id);
      if (textDeveloperInfo == null) {
        break missingId;
      }

      id = R.id.text_libraries;
      TextView textLibraries = ViewBindings.findChildViewById(rootView, id);
      if (textLibraries == null) {
        break missingId;
      }

      id = R.id.text_license;
      TextView textLicense = ViewBindings.findChildViewById(rootView, id);
      if (textLicense == null) {
        break missingId;
      }

      id = R.id.toggle_info_button;
      ImageButton toggleInfoButton = ViewBindings.findChildViewById(rootView, id);
      if (toggleInfoButton == null) {
        break missingId;
      }

      id = R.id.toggle_info_layout;
      LinearLayout toggleInfoLayout = ViewBindings.findChildViewById(rootView, id);
      if (toggleInfoLayout == null) {
        break missingId;
      }

      return new FragmentAboutBinding((LinearLayout) rootView, cardView, closeButton, englishButton,
          expandLayout, nestedScrollView, nightModeSwitch, persianButton, textApplicationInfo,
          textDesignApi, textDeveloperInfo, textLibraries, textLicense, toggleInfoButton,
          toggleInfoLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
