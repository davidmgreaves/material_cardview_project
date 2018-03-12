package com.greaves.david.materical_cardview_project;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by David on 12/03/2018.
 */

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {

    private ArrayList<Employee> mDataList;

    public EmployeeAdapter(ArrayList<Employee> dataList){
        mDataList = dataList;
    }

    @Override
    public EmployeeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_fragment_layout, parent, false);
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EmployeeViewHolder holder, int position) {
        holder.txtEmpName.setText(mDataList.get(position).getEmployeeName());
        holder.txtEmpEmail.setText(mDataList.get(position).getEmployeeEmail());
        holder.txtEmpPhone.setText(mDataList.get(position).getEmployeePhone());
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public class EmployeeViewHolder extends RecyclerView.ViewHolder {

        public TextView txtEmpName, txtEmpEmail, txtEmpPhone;

        EmployeeViewHolder(View itemView){
            super(itemView);

            txtEmpName = itemView.findViewById(R.id.txt_employee_name);
            txtEmpEmail = itemView.findViewById(R.id.txt_employee_email);
            txtEmpPhone = itemView.findViewById(R.id.txt_employee_phone);
        }
    }
}
