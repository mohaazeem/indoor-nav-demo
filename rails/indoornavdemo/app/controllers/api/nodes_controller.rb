class Api::NodesController < Api::BaseController

  def create
    @node = Node.new(node_params)

    if @node.save
      respond_with @node
    else
      render status: :internal_server_error
    end
  end

  def all_nodes
    respond_with @nodes = Node.where(graph_id: params[:graph_id])
  end

  protected
  def node_params
    params.require(:node).permit(:label, :x, :y, :type, :graph_id)
  end
end
