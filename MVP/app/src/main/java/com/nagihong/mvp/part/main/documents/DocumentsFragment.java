package com.nagihong.mvp.part.main.documents;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.nagihong.mvp.R;
import com.nagihong.mvp.base.view.BaseFragment;
import com.nagihong.mvp.model.DocumentBean;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by channagihong on 6/28/17
 */

public class DocumentsFragment extends BaseFragment<IDocuments.IPresenter> implements IDocuments.IView {

    private View vRootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (null == vRootView) {
            vRootView = inflater.inflate(R.layout.fragment_documents, container);
            ButterKnife.bind(this, vRootView);
        }
        return vRootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        getPresenter().refreshDocuments();
    }

    @OnClick(R.id.fragment_documents_fetchmore)
    public void clickFetchMore() {
        int newPage = getCurrentPage() + 1;
        getPresenter().fetchMoreDocuments(newPage);
    }

    @OnClick(R.id.fragment_documents_refresh)
    public void clickRefresh() {
        getPresenter().refreshDocuments();
    }

    @Override
    protected IDocuments.IPresenter initPresenter() {
        return new DocumentsPresenter(this);
    }

    @Override
    public void onRefreshDocumentsSuccess(List<DocumentBean> data) {
        Toast.makeText(getContext(), "onRefreshDocumentsSuccess()", Toast.LENGTH_SHORT).show();
        resetCurrentPage();
    }

    @Override
    public void onRefreshDocumentsFailed(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFetchMoreDocumentsSuccess(List<DocumentBean> data) {
        Toast.makeText(getContext(), "onFetchMoreDocumentsSuccess()", Toast.LENGTH_SHORT).show();
        updateCurrentPage(+1);
    }

    @Override
    public void onFetchMoreDocumentsFailed(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    public int getCurrentPage() {
        int current = 0;
        if (null == vRootView || null == vRootView.getTag()) {
            return current;
        }
        current = (int) vRootView.getTag();
        return current;
    }

    public boolean updateCurrentPage(int offset) {
        if (null == vRootView) {
            return false;
        }
        int current = getCurrentPage();
        current += offset;
        vRootView.setTag(offset);
        return true;
    }

    public boolean resetCurrentPage() {
        if (null == vRootView) {
            return false;
        }
        vRootView.setTag(0);
        return true;
    }
}
